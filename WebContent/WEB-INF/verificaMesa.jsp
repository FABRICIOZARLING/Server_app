<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@page import="br.com.essen.acoes.Acoes"%>
<% 
int idMesa = Integer.parseInt(request.getParameter("idMesa"));
	Acoes a = new Acoes();
	out.print(a.validaMesa(idMesa));

%>
