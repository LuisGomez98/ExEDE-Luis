package interfaz;

import org.neodatis.odb.ODB;
import org.neodatis.odb.Objects;

import logica.Departamento;
import logica.Empleado;

public interface InterfazDepart {

	void insertarDep(int num, ODB odb);

	void borrarDep(ODB odb, Objects<Departamento> dep, Objects<Empleado> emp);

	void consultarDep(Objects<Departamento> dep);

	void modificarDep(ODB odb, Objects<Departamento> dep);

}