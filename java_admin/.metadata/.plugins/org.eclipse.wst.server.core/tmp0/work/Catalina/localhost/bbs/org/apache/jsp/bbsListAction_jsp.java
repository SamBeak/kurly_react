/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.73
 * Generated at: 2023-07-18 01:12:37 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import bbs.BbsDAO;
import bbs.BbsDTO;
import java.util.ArrayList;

public final class bbsListAction_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("bbs.BbsDAO");
    _jspx_imports_classes.add("bbs.BbsDTO");
    _jspx_imports_classes.add("java.util.ArrayList");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("    \r\n");
      out.write(" \r\n");
      out.write(" \r\n");
      out.write(" \r\n");

	request.setCharacterEncoding("UTF-8");

      out.write(" \r\n");
      out.write("    \r\n");
      bbs.BbsDTO BbsDTO = null;
      BbsDTO = (bbs.BbsDTO) _jspx_page_context.getAttribute("BbsDTO", javax.servlet.jsp.PageContext.PAGE_SCOPE);
      if (BbsDTO == null){
        BbsDTO = new bbs.BbsDTO();
        _jspx_page_context.setAttribute("BbsDTO", BbsDTO, javax.servlet.jsp.PageContext.PAGE_SCOPE);
      }
      out.write(' ');
      out.write('\r');
      out.write('\n');
      org.apache.jasper.runtime.JspRuntimeLibrary.introspecthelper(_jspx_page_context.findAttribute("BbsDTO"), "userId", request.getParameter("userId"), request, "userId", false);
      out.write('\r');
      out.write('\n');
      org.apache.jasper.runtime.JspRuntimeLibrary.introspecthelper(_jspx_page_context.findAttribute("BbsDTO"), "subject", request.getParameter("subject"), request, "subject", false);
      out.write('\r');
      out.write('\n');
      org.apache.jasper.runtime.JspRuntimeLibrary.introspecthelper(_jspx_page_context.findAttribute("BbsDTO"), "content", request.getParameter("content"), request, "content", false);
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("     \r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>게시판 메인</title>\r\n");
      out.write("\r\n");
      out.write("	\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("	");

	// 로그인 정보 => 세션 가져오기
	String userId = null;
	if(session.getAttribute("userId")!=null){ // 세션값이 비어있지 않으면 세션아이디 변수에 저장
		userId = (String)session.getAttribute("userId");
	}
	
      out.write("\r\n");
      out.write("\r\n");
      out.write("	<header id='header'>\r\n");
      out.write("		<div class='container'>\r\n");
      out.write("			<div class='left'>\r\n");
      out.write("				<h1>BBS Board</h1>\r\n");
      out.write("				<a href='./admin.jsp'>HOME</a>\r\n");
      out.write("				<a href='./bbsListAction.jsp'>게시판</a>\r\n");
      out.write("			</div>\r\n");
      out.write("			<div class='right'>\r\n");
      out.write("			");

				if(userId==null){
			
      out.write("\r\n");
      out.write("				<a href='./signup.jsp'>Signup</a>\r\n");
      out.write("				<a href='./login.jsp'>Login</a>\r\n");
      out.write("			");

				}
				else{
			
      out.write("\r\n");
      out.write("				<a href='./logoutAction.jsp'>Logout</a>\r\n");
      out.write("			");

				}
			
      out.write("	\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("	</header>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div id=\"bbsList\">\r\n");
      out.write("	<div class='container'>	\r\n");
      out.write("	<table>\r\n");
      out.write("		<caption>BBS BOARD</caption>\r\n");
      out.write("		<thead>\r\n");
      out.write("			<tr>\r\n");
      out.write("				<th>번호</th>\r\n");
      out.write("				<th>제목</th>\r\n");
      out.write("				<th>작성자</th>\r\n");
      out.write("				<th>작성일</th>\r\n");
      out.write("				<th>조회수</th>\r\n");
      out.write("			</tr>			\r\n");
      out.write("		</thead>\r\n");
      out.write("		\r\n");
      out.write("		\r\n");
      out.write("		\r\n");
      out.write("		<tbody>\r\n");
      out.write("		");

			int pageNumber = 1; // 첫페이지
			// 다음페이지 클릭하면 보내진 쿼리스트링의 겟파라미터 키인 pageNumber 
			// 파라미터가 비어 있지않으면 파라미터값을 가져와서 
			// pageNumber 변수에 값을 대입(저장)한다.
			if(request.getParameter("pageNumber") !=null ){
				pageNumber = Integer.parseInt(request.getParameter("pageNumber"));
			}
		
			BbsDAO bbsDAO = new BbsDAO(); 
		    ArrayList<BbsDTO> list = bbsDAO.getList(pageNumber);
			for(int i=0; i<list.size(); i++){
		
      out.write("\r\n");
      out.write("\r\n");
      out.write("			<tr>\r\n");
      out.write("				<td>");
      out.print(list.get(i).getBbsId() );
      out.write("</td>\r\n");
      out.write("				<td><a href=\"viewAction.jsp?bbsId=");
      out.print(list.get(i).getBbsId() );
      out.write('"');
      out.write('>');
      out.print(list.get(i).getSubject() );
      out.write("</a></td>\r\n");
      out.write("				<td>");
      out.print(list.get(i).getUserId() );
      out.write("</td>\r\n");
      out.write("				<td>");
      out.print(list.get(i).getWriteDate() );
      out.write("</td>\r\n");
      out.write("				<td>");
      out.print(list.get(i).getHit() );
      out.write("</td>\r\n");
      out.write("			</tr>\r\n");
      out.write("						\r\n");
      out.write("		");

			}					
		
      out.write("\r\n");
      out.write("		</tbody>		\r\n");
      out.write("	</table>\r\n");
      out.write("\r\n");
      out.write("	<div class='pagebtn-box' style='text-align:center;'>\r\n");
      out.write("	");
		
		if(pageNumber>1){
    
      out.write("			\r\n");
      out.write("			<a class='prev-btn' href='./bbsListAction.jsp?pageNumber=");
      out.print(pageNumber-1);
      out.write("'>이전</a>\r\n");
      out.write("	");
			
		}
	
      out.write("\r\n");
      out.write("		\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("	");

		// 전체레코드수 31
		// 한페이지에 보여지 목록의 개수 3
		// 버튼 개수 2개씩 보이기(버튼 그룹)  31/3=  11/2 = 6개 그룹
		// 1개 그룹이 2개씩 보임 버튼 2개만 보이게 한다.
		
		int totalRecords = bbsDAO.totalRecordsMethod();
	    // int totalRecords = 23;
		int viewList = 3;
		int viewGoup = 2;
//		double pages = totalRecords/viewList; // 4.3....
		int pages = (int)Math.ceil(totalRecords/(double)viewList); // 11개 버튼(11페이지)
		int groups = (int)Math.ceil(pages/(double)viewGoup);  //6 버튼그룹
		int cnt = 1;
		int startNum = (cnt-1) * viewGoup;  // 0  2  4  6 8     10  
		int endNum=startNum + viewGoup;     // <2  <4  <6  <8 <10 < 12
	
      out.write("	\r\n");
      out.write("		\r\n");
      out.write("	\r\n");
      out.write("		\r\n");
      out.write("	");
	
		if(request.getParameter("cnt") !=null ){
			cnt = Integer.parseInt(request.getParameter("cnt"));
		}
		
		// 버튼그룹 => 파라미터를 통해서 다음 페이지 이동
		startNum = (cnt-1) * viewGoup; //  0
		endNum=startNum + viewGoup;    // < 2
		if(endNum > pages){
			endNum = pages;
		}
	
      out.write("\r\n");
      out.write("		\r\n");
      out.write("		\r\n");
      out.write("		\r\n");
      out.write("	");

		if( cnt > 1 ){ // 그룹버튼 개수 미만
 	
      out.write("\r\n");
      out.write("		<a class='next-group-btn' href='./bbsListAction.jsp?cnt=");
      out.print(cnt-1);
      out.write("'>&lt;</a>\r\n");
      out.write(" 	");

		}
 	
      out.write("\r\n");
      out.write(" 	\r\n");
      out.write(" 	\r\n");
      out.write("		\r\n");
      out.write("	");
	
		for(int i=startNum; i<endNum; i++){ //0~1 / 2~3 / 4~5 / 6~7
	
      out.write("		\r\n");
      out.write("			<a class='page-btn' href='./bbsListAction.jsp?pageNumber=");
      out.print(i+1);
      out.write('\'');
      out.write('>');
      out.print(i+1);
      out.write("</a>\r\n");
      out.write("	");
		
		}
	
      out.write("	\r\n");
      out.write("	\r\n");
      out.write("	\r\n");
      out.write("			\r\n");
      out.write("	");

		if(cnt < groups ){ // 그룹버튼 개수 미만
 	
      out.write("\r\n");
      out.write("		<a class='next-group-btn' href='./bbsListAction.jsp?cnt=");
      out.print(cnt+1);
      out.write("'>&gt;</a>\r\n");
      out.write(" 	");

		}
 	
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("		\r\n");
      out.write("	");

		if(bbsDAO.nextPage(pageNumber+1)){
	
      out.write("\r\n");
      out.write("			<a class='next-btn' href='./bbsListAction.jsp?pageNumber=");
      out.print(pageNumber+1);
      out.write("'>다음</a>\r\n");
      out.write("    ");
			
		}
	
      out.write("	\r\n");
      out.write("		\r\n");
      out.write("		\r\n");
      out.write("				\r\n");
      out.write("	</div>\r\n");
      out.write("	\r\n");
      out.write("	");

		if(userId!=null){
	
      out.write("	\r\n");
      out.write("	<div class=\"button-box\" style=\"text-align:center\">\r\n");
      out.write("       <a href='./write.jsp'>글쓰기</a>\r\n");
      out.write("    </div>\r\n");
      out.write("	");

		}
	
      out.write("\r\n");
      out.write("	</div>\r\n");
      out.write("</div>\r\n");
      out.write("	\r\n");
      out.write("	<style type=\"text/css\">\r\n");
      out.write("		* {margin:0; padding:0; vertical-align:center;box-sizing:border-box;}\r\n");
      out.write("		ul {list-style:none;}\r\n");
      out.write("		a {color:#333;text-decoration:none;}\r\n");
      out.write("	\r\n");
      out.write("		#header {width:100%;height:80px;background:#fff;border-bottom:1px solid #e6e6e6;}\r\n");
      out.write("		#header .container {\r\n");
      out.write("			width:100%;max-width:80%;margin:0 auto;\r\n");
      out.write("			height:100%;\r\n");
      out.write("			display:flex;\r\n");
      out.write("			align-items:center;		\r\n");
      out.write("			justify-content:space-between;\r\n");
      out.write("			font-weight:600;\r\n");
      out.write("		}	\r\n");
      out.write("		#header .container .left  {width:50%;}\r\n");
      out.write("		#header .container .left  h1 {font-size:24px;display:inline-block;color:#5f0080;margin:0 20px; 0 0;}\r\n");
      out.write("		#header .container .left  a  {foant-size:17px;color:#333;margin:0 10px;}\r\n");
      out.write("		#header .container .left  a:hover  {color:#5f0080;}\r\n");
      out.write("		#header .container .right {width:50%;text-align:right;}\r\n");
      out.write("		#header .container .right a  {foant-size:17px;color:#333;margin:0 10px;}\r\n");
      out.write("		#header .container .right a:hover  {color:#5f0080;}\r\n");
      out.write("		\r\n");
      out.write("		\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("		\r\n");
      out.write("		#bbsList {width:100%;padding:60px 0 100px 0; text-align:center;}\r\n");
      out.write("		#bbsList .container {width:100%;max-width:80%;margin:0 auto;padding:50px;background:#f3f3f3;}\r\n");
      out.write("		#bbsList table {width:100%;border-collapse:collapse;}\r\n");
      out.write("		#bbsList table caption {width:100%;padding: 0 0 30px 0;font-size:23px;font-weight:500;color:#444;text-align:left;}\r\n");
      out.write("				\r\n");
      out.write("		#bbsList table th,td {border-bottom:1px solid #e6e6e6;}		\r\n");
      out.write("		#bbsList table th {height:60px;background:#fff;color:#222;font-size:16px;}\r\n");
      out.write("		#bbsList table td {height:50px;background:#fff;color:#444;font-size:15px;text-align:center;}		\r\n");
      out.write("		#bbsList table th:nth-child(1) {width:11%;min-width:60px;}\r\n");
      out.write("		#bbsList table th:nth-child(2) {width:55%;min-width:200px;}	\r\n");
      out.write("		#bbsList table th:nth-child(3) {width:10%;min-width:100px;}\r\n");
      out.write("		#bbsList table th:nth-child(4) {width:14%;min-width:120px;}\r\n");
      out.write("		#bbsList table th:nth-child(5) {width:10%;min-width:80px;}\r\n");
      out.write("		#bbsList table tr:nth-child(even) td {background:#fcfcfc;}\r\n");
      out.write("		#bbsList table th {border-top:2px solid #999;border-bottom:1px solid #999;}		\r\n");
      out.write("		\r\n");
      out.write("\r\n");
      out.write("		#bbsList table td:nth-child(2) {text-align:left;}			\r\n");
      out.write("		#bbsList table td:nth-child(4) {font-size:14px;color:#999;}			\r\n");
      out.write("		#bbsList table td a {			\r\n");
      out.write("			padding: 0 0 0 20px;\r\n");
      out.write("			white-space:nowrap;overflow: hidden;text-overflow:ellipsis;display:block;			\r\n");
      out.write("			max-width:90%;			\r\n");
      out.write("			transition: all 0.3s;			\r\n");
      out.write("		}\r\n");
      out.write("		#bbsList table td a:hover {color:#5f0080;}\r\n");
      out.write("		\r\n");
      out.write("		#bbsList .button-box {\r\n");
      out.write("			padding: 20px 0 0 0;\r\n");
      out.write("		}\r\n");
      out.write("		#bbsList .button-box  a {\r\n");
      out.write("			background:#fff;\r\n");
      out.write("			display:flex;\r\n");
      out.write("			margin:auto;\r\n");
      out.write("			align-items: center;\r\n");
      out.write("			justify-content:center;			\r\n");
      out.write("			width:200px;height:50px;font-size:17px;color:#fff;border-radius:3px;border:0;\r\n");
      out.write("			background:#666;cursor:pointer;		\r\n");
      out.write("			transition: all 0.3s;\r\n");
      out.write("		}\r\n");
      out.write("		#bbsList .button-box a:hover {background:#111;}\r\n");
      out.write("		\r\n");
      out.write("		#bbsList .pagebtn-box {padding:30px 0;text-align:center;}\r\n");
      out.write("		#bbsList .pagebtn-box a {\r\n");
      out.write("			background:#fff;\r\n");
      out.write("			display:inline-flex;width:30px;height:30px;border:1px solid #ccc;color:#555;\r\n");
      out.write("			font-size:14px;align-items:center;justify-content:center;border-radius:2px;		\r\n");
      out.write("		}\r\n");
      out.write("		#bbsList .pagebtn-box a.page-btn {margin: 0 1px;}\r\n");
      out.write("		#bbsList .pagebtn-box a.prev-btn {width:50px;margin: 0 10px 0 0;border:0px solid #666;color:#666;}\r\n");
      out.write("		#bbsList .pagebtn-box a.next-btn {width:50px;margin: 0 0 0 10px;border:0px solid #666;color:#666;}\r\n");
      out.write("	\r\n");
      out.write("	</style>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
