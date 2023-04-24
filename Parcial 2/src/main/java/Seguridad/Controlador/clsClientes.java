/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Seguridad.Controlador;
import java.util.List;
import Seguridad.Modelo.daoClientes;
/**
 *
 * @author visitante
 */
public class clsClientes {
    private int IdAplicacion;
    private String NombreAplicacion;
    private String EstatusAplicacion;

    public int getIdAplicacion() {
        return IdAplicacion;
    }

    public void setIdAplicacion(int IdAplicacion) {
        this.IdAplicacion = IdAplicacion;
    }

    public String getNombreAplicacion() {
        return NombreAplicacion;
    }

    public void setNombreAplicacion(String NombreAplicacion) {
        this.NombreAplicacion = NombreAplicacion;
    }

    public String getEstatusAplicacion() {
        return EstatusAplicacion;
    }

    public void setEstatusAplicacion(String EstatusAplicacion) {
        this.EstatusAplicacion = EstatusAplicacion;
    }

    public clsClientes(int IdAplicacion, String NombreAplicacion, String EstatusAplicacion) {
        this.IdAplicacion = IdAplicacion;
        this.NombreAplicacion = NombreAplicacion;
        this.EstatusAplicacion = EstatusAplicacion;
    }

    public clsClientes(int IdAplicacion, String NombreAplicacion) {
        this.IdAplicacion = IdAplicacion;
        this.NombreAplicacion = NombreAplicacion;
    }

    public clsClientes(int IdAplicacion) {
        this.IdAplicacion = IdAplicacion;
    }

    public clsClientes() {
    }

    
    //Metodos de acceso a la capa controlador
    public clsClientes getBuscarInformacionAplicacionPorNombre(clsClientes aplicacion)
    {
        daoClientes daoAplicacion = new daoClientes();
        return daoAplicacion.consultaAplicacionPorNombre(aplicacion);
    }
    public clsClientes getBuscarInformacionAplicacionPorId(clsClientes aplicacion)
    {
        daoClientes daoAplicacion = new daoClientes();
        return daoAplicacion.consultaAplicacionPorId(aplicacion);
    }    
    public List<clsClientes> getListadoAplicaciones()
    {
        daoClientes daoAplicacion = new daoClientes();
        List<clsClientes> listadoUsuarios = daoAplicacion.consultaAplicacion();
        return listadoUsuarios;
    }
    public int setBorrarAplicacion(clsClientes aplicacion)
    {
        daoClientes daoAplicacion = new daoClientes();
        return daoAplicacion.borrarAplicacion(aplicacion);
    }          
    public int setIngresarAplicacion(clsClientes aplicacion)
    {
        daoClientes daoAplicacion = new daoClientes();
        return daoAplicacion.ingresaAplicacion(aplicacion);
    }              
    public int setModificarAplicacion(clsClientes aplicacion)
    {
        daoClientes daoAplicacion = new daoClientes();
        return daoAplicacion.actualizaAplicacion(aplicacion);
    }              
}
