package interfaz;

import org.neodatis.odb.ODB;
import org.neodatis.odb.Objects;

import logica.Departamento;
import logica.Empleado;

public interface InterfazDepart {

	void insertarDep(int num, ODB odb);

	void borrarDep(ODB odb, Objects<Departamento> dep, Objects<Empleado> emp);

	String consultarDep(Objects<Departamento> dep, int num1, int num2);

	void modificarDep(ODB odb, Objects<Departamento> dep);

}