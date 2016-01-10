/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;

import com.ec.entidades.Administrador;
import java.util.List;

/**
 *
 * @author ANGEL
 */
interface AdminDao extends InterfacesDao<Administrador>{
    
    public List<Administrador> listaAdmin();
}
