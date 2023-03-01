/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portuary.bo;

import com.portuary.dao.Container_DAO;
import com.portuary.dem.exceptions.JSONException;
import org.json.JSONObject;

/**
 *
 * @author Portuary
 */
public class Container_BO {
    
    /**
     * Retorna o relatório com a quantidade de Importações e Exportações
     * @param dados String contendo um JSON com os dados do filtro a ser aplicado
     * @return JSONObject contendo os dados filtrados
     * @throws java.lang.Exception
     * @throws com.portuary.dem.exceptions.JSONException
     */
    public JSONObject GetRelatorioByCategoria(String dados) throws Exception, JSONException{
        return (new Container_DAO()).getRelatorioByCategoria(new JSONObject(dados));
    }
    
}
