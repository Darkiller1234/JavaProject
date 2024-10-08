package com.kh.server.view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Scanner;

import com.kh.server.controller.LockerController;
import com.kh.server.run.ServerSend;
import com.kh.server.vo.User;

public class LockerMenu implements Runnable {
	private ServerSend ss;
	private BufferedReader br;
	private LockerController lc = new LockerController();
	private Scanner sc = new Scanner(System.in);

	public LockerMenu(Socket socket) {
		super();
		ss = new ServerSend(socket);
		try {
			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void run() {
		MainMenu();
	}

	public void MainMenu() {
		while (true) {
			if (lc.getUserIndex() == -1) {
				ss.Send("환영합니다.");
				ss.Send("로그인 또는 회원가입을 선택해주세요.");
				String str;
				try {
					str = br.readLine();
					if (str.contains("로그인")) {
						Login();
					} else if (str.contains("회원가입")) {
						Registor();
					} else if (str.contains("종료")) {
						ss.Send("종료합니다.");
						ss.Send("종료");
						return;
					} else {
						ss.Send("다시 입력해주세요.");
					}
				} catch (IOException e) {
					e.printStackTrace();
				}
			} else if (lc.getUserIndex() == -2) { // 유저별 맡긴 물건 리스트도 출력
				ss.Send("관리자님, 환영합니다.");
				ss.Send("현재 가입한 회원의 수 : " + lc.getUserList().size());
				ss.Send("");
				ss.Send("1. 유저 검색");
				ss.Send("2. 유저 삭제");
				ss.Send("3. 유저 목록 확인");
				ss.Send("9. 로그아웃");
				int num;
				try {
					num = br.read();
					br.readLine();
					switch (num) {
					case 1:
						AdminSearchUser();
						break;
					case 2:
						AdminDeleteUser();
						break;
					case 3:
						AdminCheckUser();
						break;
					case 9:
						ss.Send("로그아웃");
						Logout();
					default:
						ss.Send("다시 입력하세요.");
					}

				} catch (IOException e) {
					e.printStackTrace();
				}
			} else {
				ss.Send(lc.getUser().getName() + "님, 방문해주셔서 감사합니다.");
				ss.Send(lc.getUser().getName() + "님께서 맡기신 물건의 갯수는 ");
				ss.Send("총 " + lc.getUser().getStuff().size() + "개 입니다.");
				ss.Send("무엇을 하시겠습니까?");
				String str;
				try {
					str = br.readLine();
					if (str.contains("종료")) {
						ss.Send("종료합니다.");
						return;
					} else if (str.contains("로그아웃")) {
						ss.Send("로그아웃합니다.");
						Logout();
					} else if (str.contains("도움말")) {
						ss.Send("다움과 같은 명령어를 사용할 수 있습니다.");
						ss.Send("물건 맡기기, 물건 찾아가기, 물건 확인하기\n로그아웃, 종료");
					} else if (str.contains("맡기기") || str.contains("맡긴다")) {
						KeepStuff();
					} else if (str.contains("찾아") || str.contains("가져")) {
						TakeStuff();
					} else if (str.contains("확인")) {
						if (lc.getUser().getStuff().size() == 0) {
							ss.Send("맡기신 물건이 존재하지 않습니다.");
							continue;
						}
						ss.Send("물건 전체를 확인하시겠습니까? 아니면 물건 이름 또는 물건 종류로 찾아보시겠습니까?");
						String str2 = sc.nextLine();
						if (str2.contains("전체")) {
							StuffCheck();
						} else if (str2.contains("이름")) {
							CheckStuffName();
						} else if (str2.contains("종류")) {
							CheckStuffCategory();
						} else {
							ss.Send("처음부터 다시 입력해주세요.");
						}

					} else {
						ss.Send("도움말을 입력하여 명령어를 확인해보세요.");
					}
				} catch (IOException e) {
					e.printStackTrace();
				}

			}
		}
	}

	public void Login() {
		ss.Send("ID : ");
		String Id;
		try {
			Id = br.readLine();
			ss.Send("Password : ");
			String Pd = br.readLine();
			User u = lc.Login(Id, Pd);
			if (u == null) {
				if (lc.getUserIndex() == -2) {
					return;
				}
				ss.Send("ID 또는 Password 가 일치하지 않습니다.");
				ss.Send("");
			} else {
				ss.Send("로그인 성공.");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public void Registor() {
		ss.Send("이름 : ");
		String name;
		try {
			name = br.readLine();
			ss.Send("ID : ");
			String Id = br.readLine();
			ss.Send("Password : ");
			String Pd = br.readLine();

			boolean b = lc.Registor(name, Id, Pd);
			if (b == true) {
				ss.Send("회원가입 성공.");
			} else {
				ss.Send("아이디가 중복입니다.");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public void Logout() {
		if (lc.Logout() == true) {
			ss.Send("로그아웃 성공.");
			return;
		} else {
			ss.Send("에러");
			return;
		}
	}

	public void KeepStuff() {
		ss.Send("맡기실 물건의 이름이 뭔가요?");
		String str1;
		try {
			str1 = br.readLine();
			ss.Send("맡기실 물건의 종류는 무엇인가요?");
			String str2 = br.readLine();
			if (lc.KeepStuff(str1, str2)) {
				ss.Send("물건 맡아놓겠습니다. 감사합니다.");
			} else {
				ss.Send("중복된 이름의 물건이 이미 존재합니다.");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public void TakeStuff() {
		ss.Send("가져가실 물건의 이름이 뭔가요?");
		String name;
		try {
			name = br.readLine();
			if (lc.TakeStuff(name)) {
				ss.Send("물건 여기있습니다. 이용해주셔서 감사합니다.");
			} else {
				ss.Send("해당 물건이 존재하지 않습니다.");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public void StuffCheck() {
		ss.Send("맡기신 물건의 리스트를 출력합니다.");
		ss.Send(lc.StuffCheck());
	}

	public void CheckStuffName() {
		ss.Send("확인하실 물건의 이름을 입력해주세요.");
		String name;
		try {
			name = br.readLine();
			String str = lc.CheckStuffName(name);
			if (str.equals("")) {
				ss.Send("맡기신 물건 중 " + name + "(은)는 존재하지 않습니다.");
			} else {
				ss.Send("요청하신 물건의 정보입니다.");
				ss.Send(str);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public void CheckStuffCategory() {
		ss.Send("확인하실 물건의 종류를 입력해주세요.");
		String category;
		try {
			category = br.readLine();
			String str = lc.CheckStuffCategory(category);
			if (str.equals("")) {
				ss.Send("맡기신 물건 중 " + category + " 종류의 물건은 존재하지 않습니다.");
			} else {
				ss.Send(category + "종류의 물건 리스트입니다.");
				ss.Send(str);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public void AdminSearchUser() {
		ss.Send("유저 아이디를 입력하세요.");
		String id;
		try {
			id = br.readLine();
			User u = lc.AdminSearchUser(id);
			if (u == null) {
				ss.Send("해당 아이디를 가진 유저가 없습니다.");
				return;
			} else {
				ss.Send("해당 유저의 정보입니다.");
				ss.Send("ID : " + u.getId() + ", Password : " + u.getPd() + ", Name : " + u.getName());
				ss.Send("맡긴 물건 리스트");
				for (int i = 0; i < u.getStuff().size(); i++) {
					ss.Send(u.getStuff().get(i).toString());
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public void AdminDeleteUser() {
		ss.Send("삭제할 유저의 아이디를 입력하세요.");
		String id;
		try {
			id = br.readLine();
			if (lc.AdminDeleteUser(id)) {
				ss.Send("삭제성공");
			} else {
				ss.Send("삭제실패, 해당하는 id가 없습니다.");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public void AdminCheckUser() {
		ArrayList<User> u = lc.AdminCheckUser();
		for (int i = 0; i < u.size(); i++) {
			ss.Send(
					"ID : " + u.get(i).getId() + ", Password : " + u.get(i).getPd() + ", Name : " + u.get(i).getName());
			ss.Send("맡긴 물건 리스트");
			for (int j = 0; j < u.get(i).getStuff().size(); j++) {
				ss.Send(u.get(i).getStuff().get(j).toString());
			}
			ss.Send("");
		}
	}

}
