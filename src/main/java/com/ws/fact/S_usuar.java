package com.ws.fact;

import javax.persistence.*;


@Entity
@Table(name = "s_usuar")
public class S_usuar {
	
	  	@Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)	   	    
	    private String usuario;
	    private String descrip;
		public String getUsuario() {
			return usuario;
		}
		public void setUsuario(String usuario) {
			this.usuario = usuario;
		}
		public String getDescrip() {
			return descrip;
		}
		public void setDescrip(String descrip) {
			this.descrip = descrip;
		}
		@Override
		public String toString() {
			return "S_usuar [usuario=" + usuario + ", descrip=" + descrip + "]";
		}	  
	    
	    
	    
	    
}
