package m2.servlet;
// C control
import java.io.IOException;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import m2.model2.GuGuService;
import java.util.ArrayList;
@WebServlet("/mvc/gugu2")
public class GuGuServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// 요청 전처리
		// 1. 요청분석
		int dan = Integer.parseInt(request.getParameter("dan"));
		// 디버깅
		System.out.println(dan+"<--dan GuGuServlet.doGet()");
		// 2. 요청 처리 요구
		GuGuService service = new GuGuService();
		ArrayList<String> list = service.getGugudanList(dan); // 요청 처리
		// 3. 출력을 위임(요청과응답을 포워딩 + 모델값(list))
		request.setAttribute("list", list); // 2.request안에 추가로 데이터저장 // setAttribute(String, Object)
		RequestDispatcher rd = request.getRequestDispatcher("gugu2.jsp");
		rd.forward(request, response); // list 누락됨 해결방법 1.세션(계속남아있는단점) 2.request안에 추가로 데이터저장
	}
}
