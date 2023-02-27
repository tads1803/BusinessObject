/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portuary.bo;

import com.portuary.dao.Movimentacao_DAO;
import com.portuary.dem.exceptions.JSONException;
import org.json.JSONObject;

/**
 *
 * @author Portuary
 */
public class Movimentacao_BO {
    
    /**
     * Retorna o relatório com a quantidade por Tipo de Movimento
     * @return JSONObject contendo os dados filtrados
     * @throws java.lang.Exception
     * @throws com.portuary.dem.exceptions.JSONException
     */
    public JSONObject GetRelatorioByMovimento() throws Exception, JSONException{
        return (new Movimentacao_DAO()).getRelatorioByMovimentacao();
    }
    
}
