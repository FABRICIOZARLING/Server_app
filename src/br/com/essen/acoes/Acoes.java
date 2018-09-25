package br.com.essen.acoes;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;
import java.util.List;

import br.com.essen.bean.CategoriasBean;
import br.com.essen.bean.MesasBean;
import br.com.essen.bean.ProdutosBean;
import br.com.essen.dao.GenericDao;

public class Acoes {
	GenericDao gd = new GenericDao();
	public String validaMesa(String idMesa) throws IllegalAccessException, NoSuchMethodException, IllegalArgumentException, InvocationTargetException, InstantiationException, ClassNotFoundException, SQLException, IOException {
		int id = 0;
		try {
			id = Integer.parseInt(idMesa);
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		String msg = "";
		if((id>0)&&(id<17)){

			List<Object> lista = gd.listarTabela(MesasBean.class);
			MesasBean mb = (MesasBean)lista.get(id);
			//msg = mb.getUsoMesa();
			if(mb.getUsoMesa().equals("0")) {
				msg = "livre";
			}else {
				msg = "ocupada";
			}
			
		}else {
			msg = "null";
		}

		return msg;
	}
	
	public String listaCategorias() throws IllegalAccessException, NoSuchMethodException, IllegalArgumentException, InvocationTargetException, InstantiationException, ClassNotFoundException, SQLException, IOException {
		String html = "";
		List<Object> lista = gd.listarTabela(CategoriasBean.class);
		
		for (Object l : lista) {
			CategoriasBean cb = (CategoriasBean)l;
			html += "<div style=\"margin-right:-20px;\"><a ui-sref='menu.comidas()' onclick='defineCategoria("+cb.getIdCategoria()+");' id='fazerPedido-button8' style='left:-10px;' class='button button-assertive button-full' href=\"#/side-menu21/page5\">"+cb.getNomeCategoria()+"</a></div>";
		}
		
		
		
		return html;
	}
	
	public String listaProdutos(String id) throws IllegalAccessException, NoSuchMethodException, IllegalArgumentException, InvocationTargetException, InstantiationException, ClassNotFoundException, SQLException, IOException {
		String html = "";
		int idCategoria = 0;
		try {
			idCategoria = Integer.parseInt(id);
		} catch (Exception e) {
			// TODO: handle exception
		}
		List<Object> lista = gd.listarTabela(ProdutosBean.class);
		for (Object l : lista) {
			ProdutosBean pb = (ProdutosBean) l;
			if(pb.getIdCategoria()==idCategoria) {
				html +="<div style=\"margin-left: -10px; width: calc(100% + 20px);\">\r\n" + 
						"      <img src='"+pb.getImgProduto()+"' style=\"display: block; width: 100%; height: 150px; margin-left: auto; margin-right: auto;\">\r\n" + 
						"    </div>\r\n" + 
						"    <div class=\"spacer\" style=\"width: 300px; height: 16px;\"></div>\r\n" + 
						"	 <h2>"+pb.getNomeProduto()+"<h2"+
						"    <div id=\"comidas-markdown1\" style=\"text-align:center;\" class=\"show-list-numbers-and-dots\">\r\n" + 
						"      <p style=\"color:#FFFFFF; background-color:white;\">"+pb.getDescricaoProduto()+"</p>\r\n" + 
						"    <ion-item class=\"item-icon-left\" id=\"visualizarPedidoFinal-list-item8\">\r\n" + 
						"        <i class=\"icon ion-social-usd-outline\"></i>"+String.format("%.2f",pb.getValorProduto())+"</ion-item>\r\n" + 
						"    </ion-list></div>\r\n" + 
						"    <div style=\"margin-right:-20px;\">\r\n" + 
						"      <a ui-sref=\"menu.quantidade()\" id=\"comidas-button12\" style=\"left:-10px;\" class=\"button button-assertive button-full\">Pedir</a>\r\n" + 
						"    </div";
			}
			
		}
		
		
		return html;
	}
	
	/*<div style="margin-left: -10px; width: calc(100% + 20px);">
      <img src="img/nPzKUErfQkCamfHwmYIs_Junk-Food.jpg" style="display: block; width: 100%; height: 150px; margin-left: auto; margin-right: auto;">
    </div>
    <div class="spacer" style="width: 300px; height: 16px;"></div>
    <div id="comidas-markdown1" style="text-align:center;" class="show-list-numbers-and-dots">
      <p style="color:#FFFFFF;">Descrição da food</p>
    </div>
    <div style="margin-right:-20px;">
      <a ui-sref="menu.quantidade()" id="comidas-button12" style="left:-10px;" class="button button-assertive button-full">Pedir</a>
    </div>*/
	
	
    //<div style="margin-right:-20px;" id="categorias">
    
    //</div><a ui-sref="menu.comidas()" id="1" style="left:-10px;" class="button button-assertive button-full" href="#/side-menu21/page5">Salgados</a>
    //<a ui-sref="menu.comidas()" id="fazerPedido-button8" style="left:-10px;" class="button button-assertive button-full">Salgados</a>
	//<ion-item>Pedido</ion-item>

}
