package br.com.traderhelper.importador.domain;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Michael on 14/12/2016.
 */
public class CotacaoHistorica {

    private List<RegistroCotacaoDiaria> registroCotacaoDiariaList;
    private RegistroTrailer registroTrailer;

    public List<RegistroCotacaoDiaria> getRegistroCotacaoDiariaList() {
        if (registroCotacaoDiariaList == null) {
            registroCotacaoDiariaList = new ArrayList<>();
        }
        return registroCotacaoDiariaList;
    }

    public void setRegistroCotacaoDiariaList(List<RegistroCotacaoDiaria> registroCotacaoDiariaList) {
        this.registroCotacaoDiariaList = registroCotacaoDiariaList;
    }

    public RegistroTrailer getRegistroTrailer() {
        return registroTrailer;
    }

    public void setRegistroTrailer(RegistroTrailer registroTrailer) {
        this.registroTrailer = registroTrailer;
    }

    public void addCotacaoDiaria(RegistroCotacaoDiaria registroCotacaoDiaria) {
        this.getRegistroCotacaoDiariaList().add(registroCotacaoDiaria);
    }
}
