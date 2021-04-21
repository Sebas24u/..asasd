package pe.edu.upc.service;

import java.util.List;

import pe.edu.upc.entity.Rutina;

public interface IRutinaService {
	public void insertar(Rutina rutinan);
	public List<Rutina> listar();
	public void eliminar(int idRutina);

}
