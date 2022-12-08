package managers;

import entities.Category;
import entities.Seller;
import services.BaseService;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

public class SellerManager implements BaseService<Seller> {

    static List<Seller> sellers = Arrays.asList(
            new Seller(1, "Tukan no 1"),
            new Seller(2, "Megi mall"),
            new Seller(3, "Nikos"),
            new Seller(4, "Huseyn Azizoglu club"));

    @Override
    public Seller getById(int id) {

        AtomicReference<Seller> _seller = new AtomicReference<>();

        sellers
                .forEach(seller -> {
                    if (seller.getId() == id) {
                        _seller.set(seller);
                    }
                });
        return _seller.get();
    }

    @Override
    public List<Seller> getAll() {
        return sellers;
    }

    @Override
    public void deleteById(int id) {


        AtomicReference<Seller> deletingSeller = new AtomicReference<>();

        sellers.forEach(seller -> {
            if (seller.getId() == id) {
                deletingSeller.set(seller);
            }
        });

        sellers.remove(deletingSeller.get());


    }
}
