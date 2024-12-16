package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import config.Database;
import Ui.OrderDetail;

public abstract class OrderDetailRepo implements OrderDetailDAO {
    private Connection connection;

    private static final String INSERT = "INSERT INTO order_detail(id_order_detail, id_order, id_layanan, jumlah, total) VALUES(?, ?, ?, ?, ?);";
    private static final String SELECT = "SELECT * FROM order_detail;";
    private static final String DELETE = "DELETE FROM order_detail WHERE id_order_detail = ?;";
    private static final String UPDATE = "UPDATE Order_Detail SET id_order = ?, id_layanan = ?, jumlah = ?, total = ? WHERE id_Order_etail = ?;";

    public OrderDetailRepo() {
        connection = Database.koneksi();
    }

    @Override
    public void save(OrderDetail orderDetail) {
        try (PreparedStatement st = connection.prepareStatement(INSERT)) {
            st.setString(1, orderDetail.getIdOrderDetail());
            st.setString(2, orderDetail.getIdOrderDetail());
            st.setString(3, orderDetail.getIdLayanan());
            st.setInt(4, orderDetail.getJumlah());
            st.setDouble(5, orderDetail.getTotal());
            st.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void delete(String idOrderDetail) {
        try (PreparedStatement st = connection.prepareStatement(DELETE)) {
            st.setString(1, idOrderDetail);
            st.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void update(OrderDetail orderDetail) {
        try (PreparedStatement st = connection.prepareStatement(UPDATE)) {
            st.setString(1, orderDetail.getIdOrderDetail());
            st.setString(2, orderDetail.getIdLayanan());
            st.setInt(3, orderDetail.getJumlah());
            st.setDouble(4, orderDetail.getTotal());
            st.setString(5, orderDetail.getIdOrderDetail());
            st.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    // Implementasi findAll() akan ditambahkan nanti sesuai kebutuhan
}
