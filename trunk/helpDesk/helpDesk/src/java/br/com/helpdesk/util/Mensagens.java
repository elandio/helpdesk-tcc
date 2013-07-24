package br.com.helpdesk.util;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

public class Mensagens {

    public static final String MSG_ERRO = "ERRO";
    public static final String MSG_FATAL = "FATAL";
    public static final String MSG_INFO = "INFO";
    public static final String MSG_ALERTA = "ALERTA";

    private Mensagens() {
    }

    public static void mensagem(String tipo, String texto, String detalhes) {

        FacesMessage msg = null;

        if (tipo.equals(MSG_ERRO)) {
            msg = new FacesMessage(FacesMessage.SEVERITY_ERROR, texto, detalhes);
        }
        
        if (tipo.equals(MSG_FATAL)) {
            msg = new FacesMessage(FacesMessage.SEVERITY_FATAL, texto, detalhes);
        }
        
        if (tipo.equals(MSG_INFO)) {
            msg = new FacesMessage(FacesMessage.SEVERITY_INFO, texto, detalhes);
        }
        
        if (tipo.equals(MSG_ALERTA)) {
            msg = new FacesMessage(FacesMessage.SEVERITY_WARN, texto, detalhes);
        }
        
        FacesContext.getCurrentInstance().addMessage(null, msg);

    }
}
