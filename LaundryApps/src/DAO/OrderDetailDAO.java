package DAO;

import java.util.List;
import Ui.OrderDetail;

public interface OrderDetailDAO {

	void save(OrderDetail orderDetail);
    List<OrderDetail> findAll();
    void update(OrderDetail orderDetail);
    void delete(String idOrderDetail);
}
