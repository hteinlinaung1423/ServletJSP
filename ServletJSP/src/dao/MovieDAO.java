package dao;

import java.sql.SQLException;
import java.util.ArrayList;

import dto.MovieDTO;
import exception.MyDataException;

public interface MovieDAO {

	ArrayList<MovieDTO> findAllMovies() throws MyDataException;

	int updateMovie(MovieDTO m) throws MyDataException, SQLException;
	int insertMovie(MovieDTO m) throws MyDataException, SQLException;
	int deleteMovie(int id) throws MyDataException, SQLException;
	
	MovieDTO findById(int id) throws MyDataException;

}