<%@page import="br.com.essen.acoes.Acoes"%>

<% 
String idMesa = request.getParameter("idMesa");
	Acoes a = new Acoes();
	String msg = a.validaMesa(idMesa);
	out.print(msg);

%>




