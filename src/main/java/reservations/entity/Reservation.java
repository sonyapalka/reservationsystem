package reservations.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="RESERVATION")
public class Reservation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long resId;

    @Temporal(TemporalType.TIMESTAMP)
    private Date date;

    @Column(name="NUMBER_OF_PLAYERS")
    private int numberOfPlayers;

    @Column(name="TOTAL_PRICE")
    private double totalPrice;

    public Long getResId() {
        return resId;
    }

    public void setResId(Long resId) {
        this.resId = resId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getNumberOfPlayers() {
        return numberOfPlayers;
    }

    public void setNumberOfPlayers(int numberOfPlayers) {
        this.numberOfPlayers = numberOfPlayers;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    @Override
    public String toString() {
        return "Reservation{" +
                "resId=" + resId +
                ", date=" + date +
                ", numberOfPlayers=" + numberOfPlayers +
                ", totalPrice=" + totalPrice +
                '}';
    }
}
