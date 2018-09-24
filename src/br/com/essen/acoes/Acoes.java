package br.com.essen.acoes;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;
import java.util.List;

import br.com.essen.bean.MesasBean;
import br.com.essen.dao.GenericDao;

public class Acoes {
	
	public String validaMesa(int idMesa) throws IllegalAccessException, NoSuchMethodException, IllegalArgumentException, InvocationTargetException, InstantiationException, ClassNotFoundException, SQLException, IOException {
		String msg = "";
		if((idMesa>0)&&(idMesa<17)){
			GenericDao gd = new GenericDao();
			List<Object> lista = gd.listarTabela(MesasBean.class);
			MesasBean mb = (MesasBean)lista.get(idMesa);
			if(mb.getUsoMesa()=="0") {
				msg = "livre";
			}else {
				msg = "ocupada";
			}
			
		}else {
			msg = "null";
		}
		return msg;
	}

}
