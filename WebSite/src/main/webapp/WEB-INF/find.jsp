<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>조회하기!</title>
</head>
<body>
<div>
       <table class="table" border="1">
         <thead>
            <tr>
               <th>id</th>
               <th>이름</th>
               <th>메세지</th>

            </tr>
         </thead>
         <tbody>
		<c:forEach items="${requestScope.memberList}" var="member">
                  
               <tr class="tr2">
                        <td class="td">
                           ${member.id }
                        </td>
                        <td class="td">
                           ${member.name }
                        </td>
                        <td class="td">
                           ${member.message }
                        </td>
              
               </tr>
              </c:forEach>

         </tbody>
      </table> 
</div>	





	<a href="index.jsp"> main 페이지로 이동</a>
</body>
</html>