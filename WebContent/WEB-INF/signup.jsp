<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>ユーザー登録</title>
	</head>
	<body>
		<div class="main-contents">
			<c:if test="${ not empty errorMessages }">
				<div>
					<ul>
						<c:forEach items="${errorMessages}" var="errormessage">
							<li><c:out value="${errorMessage}" />
						</c:forEach>
					</ul>
				</div>
			</c:if>

			<form action="signup" method="post"><br />
				<label for="name">名前</label>
				<input name="name" id="name" /><br />

				<label for="account">アカウント名</label>
				<input name="account" id="account" /><br />

				<label for="password">パスワード</label>
				<input name="password" type="password" id="password" /><br />

				<label for="email">メールアドレス</label>
				<input name="email" id="email" /><br />

				<label for="description">説明</label>
				<textarea name="description" cols="35" rows="5" id="description"></textarea><br />

				<input type="submit" value="登録" /><br />
				<a href="./">戻る</a>
			</form>

			<div class="copyright">Copyright(c)SimpleTwitter</div>
		</div>
	</body>
</html>