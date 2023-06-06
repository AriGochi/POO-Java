package org.example.persistencia;

import org.example.modelo.SistemaSolar;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.ResultSet;
import java.sql.Statement;


public class PlanetaDAO implements InterfazDAO{
    public PlanetaDAO() {
    }

    @Override
    public boolean insentar(Object obj) throws SQLException {
        String sqlInsert = "INSERT INTO planetas(ubicacion,numeroplanetas,planetagrande,planetacercano,imagen) VALUES (?, ?, ?, ?, ?, ?)";
        int rowCount = 0;

        PreparedStatement pstm = ConexionSingleton.getInstance("planetas.db").getConnection().prepareStatement(sqlInsert);
        pstm.setInt(1, (((SistemaSolar) obj).getID()));
        pstm.setString(2, ((SistemaSolar) obj).getUbiSistemaSolar());
        pstm.setInt(3, ((SistemaSolar) obj).getNumDePlanetas());
        pstm.setString(4, ((SistemaSolar) obj).getPlanetaMasGrande());
        pstm.setString(5, ((SistemaSolar) obj).getPlanetaCercanoSol());
        pstm.setString(6, ((SistemaSolar) obj).getImagenUrl());
        rowCount = pstm.executeUpdate();
        return rowCount > 0;    }

    @Override
    public boolean update(Object obj) throws SQLException {
        String sqlUpdate = "UPDATE planetas SET ubicacion = ?, numeroplanetas = ?, planetagrande = ?, planetacercano = ?, imagen = ? WHERE id = ?;";
        int rowCount = 0;
        PreparedStatement pstm = ConexionSingleton.getInstance("planetas.db").getConnection().prepareStatement(sqlUpdate);
        pstm.setString(1, ((SistemaSolar) obj).getUbiSistemaSolar());
        pstm.setInt(2, ((SistemaSolar) obj).getNumDePlanetas());
        pstm.setString(3, ((SistemaSolar) obj).getPlanetaMasGrande());
        pstm.setString(4, ((SistemaSolar) obj).getPlanetaCercanoSol());
        pstm.setString(5, ((SistemaSolar) obj).getImagenUrl());
        pstm.setInt(6, ((SistemaSolar) obj).getID());

        rowCount = pstm.executeUpdate();
        return rowCount > 0;
    }

    @Override
    public boolean delete(String id) throws SQLException {
        String dqlDelete = "DELETE FROM planetas WHERE id = ?;";
        int rowCount = 0;
        PreparedStatement pstm = ConexionSingleton.getInstance("planetas.db").getConnection().prepareStatement(dqlDelete);
        pstm.setInt(1, Integer.parseInt(id));
        rowCount = pstm.executeUpdate();

        return rowCount > 0;

    }

    @Override
    public ArrayList obtenerTodo() throws SQLException {
        String sql = "SELECT * FROM planetas";
        ArrayList<SistemaSolar> resultado = new ArrayList<>();

        Statement stm = ConexionSingleton.getInstance("Grupos.db").getConnection().createStatement();
        ResultSet rst = stm.executeQuery(sql);
        while (rst.next()){
            resultado.add(new SistemaSolar(rst.getInt(1),rst.getString(2),rst.getInt(3),rst.getString(4),rst.getString(5),rst.getString(6)));

        }
        return resultado;
    }

    @Override
    public Object buscarPorId(String id) throws SQLException {
        String sql = "SELECT * FROM planetas WHERE id = ?;";
        SistemaSolar sistemaSolar= null;

        PreparedStatement pstm = ConexionSingleton.getInstance("planetas.db").getConnection().prepareStatement(sql);
        ResultSet rst = pstm.executeQuery();
        if (rst.next()){
            sistemaSolar = new SistemaSolar(rst.getInt(1),rst.getString(2),rst.getInt(3),rst.getString(4),rst.getString(5),rst.getString(6));

            return sistemaSolar;
        }
        return null;
    }
    }

