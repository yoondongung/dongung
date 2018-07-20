<%@ page contentType="text/html;charset=utf-8"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>

<h1> 반갑습니다. </h1>
<h2> jetty를 띄우는데 성공했어요!!!! </h2>


<form action="${initParam.rootPath }/insertMember.do">
이름 : <input type="text" name="name" >
메세지 : <input type="text" name="message">
<button type="submit">값을 저장하게 눌러봐</button>
</form>

<br>
<br>

 <form action="${initParam.rootPath }/updateMember.do">
업데이트 할 id : <input type="number" name="id" > 
이름 : <input type="text" name="name" >
메세지 : <input type="text" name="message">
<button type="submit">업데이트하게 눌러봐</button>
</form>


<form action="${initParam.rootPath }/findMember.do">
memberId를 입력하시오
<input type="number" id="memberId" name="memberId">
<button type="submit">값을 찾아봐!! 눌러봐</button>
</form>

<form action="${initParam.rootPath }/findMemberName.do">
memberName를 입력하시오
<input type="text" id="memberName" name="memberName">
<button type="submit">값을 찾아봐!! 눌러봐</button>
</form>

<form action="${initParam.rootPath }/findMemberAll.do">
<button type="submit">전체 member조회</button>
</form>


<form action="${initParam.rootPath }/deleteMember.do">
memberId를 입력하시오
<input type="number" id="memberId" name="memberId">
<button type="submit">삭제 시작!</button>
</form>

</body>
</html>