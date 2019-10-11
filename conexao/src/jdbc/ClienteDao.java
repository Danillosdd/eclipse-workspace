package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import sistema.Cliente;

public class ClienteDao {

	private static final String insertSql = "INSERT INTO CLIENTE"
			+ "(NOME, LOGIN, SENHA, ENDERECO, CIDADE, BAIRRO, ESTADO, CEP)" + "VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

	private static final String selectsql = "SELECT *" + "FROM CLIENTE WHERE SENHA = ? AND LOGIN = ?";

	private static final String updatesql = "UPDATE CLIENTE SET"
			+ " SENHA = ?, LOGIN = ?, ENDERECO = ?, CIDADE = ?, BAIRRO = ?, ESTADO = ?, CEP = ? WHERE COD_CLIENTE = ?";

	private static final String deletesql = "DELETE FROM CLIENTE WHERE COD_CLIENTE = ?";

	public Cliente inserirCliente(Cliente cliente) {

		try (Connection conexao = FabricaConexao.getConexao();
				PreparedStatement consulta = conexao.prepareStatement(insertSql)

		) {

			consulta.setString(1, cliente.getNome());
			consulta.setString(2, cliente.getLogin());
			consulta.setString(3, cliente.getSenha());
			consulta.setString(4, cliente.getEndereco());
			consulta.setString(5, cliente.getCidade());
			consulta.setString(6, cliente.getBairro());
			consulta.setString(7, cliente.getEstado());
			consulta.setString(8, cliente.getCep());

			consulta.executeUpdate();

			System.out.println("Inserido com Sucesso!");
			System.out.println("------------------------");

		} catch (SQLException e) {

			e.printStackTrace();
			// e.getMessage();

		}

		return cliente;

	}

	public Cliente updateCliente(Cliente cliente) {

		try (Connection conexao = FabricaConexao.getConexao();
				PreparedStatement consulta = conexao.prepareStatement(updatesql)

		) {

			consulta.setString(1, cliente.getSenha());
			consulta.setString(2, cliente.getLogin());
			consulta.setString(3, cliente.getEndereco());
			consulta.setString(4, cliente.getCidade());
			consulta.setString(5, cliente.getBairro());
			consulta.setString(6, cliente.getEstado());
			consulta.setString(7, cliente.getCep());
			consulta.setInt(8, cliente.getCodigo());

			consulta.execute();

			System.out.println("Atualizado com Sucesso!");
			System.out.println("------------------------");

		} catch (SQLException e) {

			e.printStackTrace();
			// e.getMessage();

		}

		return cliente;

	}

	public Cliente obterCliente(Cliente cliente) {

		try (Connection conexao = FabricaConexao.getConexao();
				PreparedStatement consulta = conexao.prepareStatement(selectsql)

		) {

			consulta.setString(1, cliente.getSenha());
			consulta.setString(2, cliente.getLogin());

			ResultSet resultado = consulta.executeQuery();

			if (resultado.next()) {

				cliente.setNome(resultado.getString("NOME"));
				cliente.setSenha(resultado.getString("SENHA"));
				cliente.setLogin(resultado.getString("LOGIN"));
				cliente.setEndereco(resultado.getString("ENDERECO"));
				cliente.setCidade(resultado.getString("CIDADE"));
				cliente.setBairro(resultado.getString("BAIRRO"));
				cliente.setEstado(resultado.getString("ESTADO"));
				cliente.setCep(resultado.getString("CEP"));
				cliente.setCodigo(resultado.getInt("COD_CLIENTE"));
			} else {

				cliente = null;

			}

		} catch (SQLException e) {

			e.printStackTrace();
			// e.getMessage();

		}

		return cliente;

	}

	public Cliente deletarCliente(Cliente cliente) {

		try (Connection conexao = FabricaConexao.getConexao();
				PreparedStatement consulta = conexao.prepareStatement(deletesql)

		) {

			consulta.setInt(1, cliente.getCodigo());

			consulta.executeUpdate();

		} catch (SQLException e) {

			e.printStackTrace();
			// e.getMessage();

		}

		return cliente;

	}
}
