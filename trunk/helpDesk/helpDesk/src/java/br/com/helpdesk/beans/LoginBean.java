package br.com.helpdesk.beans;

import br.com.helpdesk.util.Mensagens;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.event.ActionEvent;
import org.primefaces.context.RequestContext;

@ManagedBean(name = "loginBean")
@RequestScoped
public class LoginBean {

    private String usuario;
    private String senha;

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public void login(ActionEvent actionEvent) {
        
        RequestContext context = RequestContext.getCurrentInstance();
        boolean loggedIn = false;
        
//        if (usuario != null && usuario.equals("admin") && senha != null && senha.equals("admin")) {
//            loggedIn = true;
//            msg = new FacesMessage(FacesMessage.SEVERITY_INFO, "Welcome", usuario);
//        } else {
            loggedIn = false;
            Mensagens.mensagem(Mensagens.MSG_FATAL, "Acesso Negado", null);
        //}

        context.addCallbackParam("loggedIn", loggedIn);
        
    }
}
