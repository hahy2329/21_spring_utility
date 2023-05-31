<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>bWrite</title>
</head>
<body>
	<div align="center">
		<form action="boardWrite" method="post" >
			<div  align="center">
				<h2>게시글 쓰기</h2>
				<br>
			</div>
			<table border="1" style="width:600px;" >
				<colgroup>
					<col width="20%">
					<col width="80%">
				</colgroup>
				<tr>
					<td align="center">작성자</td>
					<td><input type="text" id="writer" name="writer" size="70"/></td>
				</tr>
				<tr >
					<td align="center">제목</td>
					<td><input type="text" id="subject" name="subject" size="70"/></td>
				</tr>
				<tr>
					<td align="center">이메일</td>
					<td><input type="email" id="email" name="email" size="70"/></td>
				</tr>
				<tr>
					<td align="center">비밀번호</td>
					<td><input type="password" id="password" name="password" size="70"/></td>
				</tr>
				<tr>
					<td align="center">글내용</td>
					<td><textarea  rows="10" cols="50" id="content" name="content" ></textarea></td>
				</tr>
				<tr align="center">
					<td colspan="2">
						<input type="submit" value="글쓰기" />
						<input type="reset"  value="다시작성" />
					</td>
				</tr>
			</table>
		</form>
	</div>
</body>
</html>