<%@page import="br.com.essen.acoes.Acoes"%>

<% 
int idMesa = Integer.parseInt(request.getParameter("idMesa"));
	Acoes a = new Acoes();
	String msg = a.validaMesa(idMesa);
	out.print(msg);

%>




