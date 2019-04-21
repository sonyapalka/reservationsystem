package reservations.entity;

import reservations.enums.Categories;
import reservations.enums.Levels;
import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="ROOM")
public class Room {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long roomId;

    @Column(name="NAME")
    private String name;

    @Column(name="MIN_PLAYERS")
    private int minPlayers;

    @Column(name="MAX_PLAYERS")
    private int maxPlayers;

    @Column(name="BASE_PRICE")
    private double basePrice;

    @Column(name="PRICE_PER_PLAYER")
    private double pricePerPlayer;

    @Column(name="DESCRIPTION")
    private String description;

    @Enumerated(EnumType.STRING)
    private Levels level;

    @Enumerated(EnumType.STRING)
    private Categories category;

    @Column(name="GAME_DURATION")
    private int gameDuration;

    @Column(name="CLEANING_TIME")
    private int cleaningTime;

    @Column(name="START_HOUR")
    private int startHour;

    @Column(name="END_HOUR")
    private int endHour;

    @Column(name="ADDRESS")
    private String address;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "ROOM_ID")
    private Set<Reservation> reservation =  new HashSet();

    public Long getRoomId() {
        return roomId;
    }

    public void setRoomId(Long roomId) {
        this.roomId = roomId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMinPlayers() {
        return minPlayers;
    }

    public void setMinPlayers(int minPlayers) {
        this.minPlayers = minPlayers;
    }

    public int getMaxPlayers() {
        return maxPlayers;
    }

    public void setMaxPlayers(int maxPlayers) {
        this.maxPlayers = maxPlayers;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(double basePrice) {
        this.basePrice = basePrice;
    }

    public double getPricePerPlayer() {
        return pricePerPlayer;
    }

    public void setPricePerPlayer(double pricePerPlayer) {
        this.pricePerPlayer = pricePerPlayer;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Levels getLevel() {
        return level;
    }

    public void setLevel(Levels level) {
        this.level = level;
    }

    public Categories getCategory() {
        return category;
    }

    public void setCategory(Categories category) {
        this.category = category;
    }

    public int getGameDuration() {
        return gameDuration;
    }

    public void setGameDuration(int gameDuration) {
        this.gameDuration = gameDuration;
    }

    public int getCleaningTime() {
        return cleaningTime;
    }

    public void setCleaningTime(int cleaningTime) {
        this.cleaningTime = cleaningTime;
    }

    public int getStartHour() {
        return startHour;
    }

    public void setStartHour(int startHour) {
        this.startHour = startHour;
    }

    public int getEndHour() {
        return endHour;
    }

    public void setEndHour(int endHour) {
        this.endHour = endHour;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Set<Reservation> getReservation() {
        return reservation;
    }

    public void setReservation(Set<Reservation> reservation) {
        this.reservation = reservation;
    }

    @Override
    public String toString() {
        return "Room{" +
                "roomId=" + roomId +
                ", name='" + name + '\'' +
                ", minPlayers=" + minPlayers +
                ", maxPlayers=" + maxPlayers +
                ", basePrice=" + basePrice +
                ", pricePerPlayer=" + pricePerPlayer +
                ", description='" + description + '\'' +
                ", level='" + level + '\'' +
                ", category='" + category + '\'' +
                ", gameDuration=" + gameDuration +
                ", cleaningTime=" + cleaningTime +
                ", startHour=" + startHour +
                ", endHour=" + endHour +
                ", address='" + address + '\'' +
                ", reservation=" + reservation +
                '}';
    }

}
