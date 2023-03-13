<%@ page import="com.example.tpelbat.chatRoom" %>
<%@ page import="java.io.PrintWriter" %><%--
  Created by IntelliJ IDEA.
  User: Guillaume medard
  Date: 13/03/2023
  Time: 09:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Pseudo : <%= request.getParameter("pseudo") %></h1>
      <div id="dialog_box">
          <% for (String message : chatRoom.getInstance().getMessages()) { %>
          <%= message %>
          <% } %>
      </div>
      <form method="post" action="/tpElbat-1.0-SNAPSHOT/ServletDisconnect">
          <input type="submit" value="Se deconnecter">
          <input type="hidden" name="pseudo" value="<%= request.getParameter("pseudo")%>">
      </form>
      <form method="post" action="/tpElbat-1.0-SNAPSHOT/ServletChatRoom">
          <input type="submit" value="envoyer">
          <input type="text" PLACEHOLDER="Entrez votre message" name="msg">
          <input type="hidden" name="pseudo" value="<%= request.getParameter("pseudo")%>">
      </form>
      <form method="post" action="/tpElbat-1.0-SNAPSHOT/ServletRefresh">
          <input type="submit" value="Rafraichir">
          <input type="hidden" name="pseudo" value="<%= request.getParameter("pseudo")%>">
      </form>
</body>
</html>
