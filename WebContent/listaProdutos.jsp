<%@page import="br.com.essen.acoes.Acoes"%>

<% 
	Acoes a = new Acoes();
	String msg = a.listaCategorias();
	out.print(msg);

%>
