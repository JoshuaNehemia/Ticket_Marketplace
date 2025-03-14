/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package ticketmarketplace_server.Entities;
import java.time.LocalDate; 
import java.util.List;
import java.util.ArrayList;


/**
 *
 * @author Franly
 */
public class User {
    private String username;
    private String fullname;
    private String email;
    private LocalDate birthdate;
    private List<Ticket> tickets; 


    public User(String username, String fullname, String email, LocalDate birthdate) {
        this.username = username;
        this.fullname = fullname;
        this.email = email;
        this.birthdate = birthdate;
        this.tickets = new ArrayList<>();
    }
    
    public User() {
        this.username = "";
        this.fullname = "";
        this.email = "";
        this.birthdate = null; 
        this.tickets = new ArrayList<>();
    }
    
    public void addTicket(Ticket ticket) {
        tickets.add(ticket);
    }

    public List<Ticket> getTickets() {
        return tickets;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(LocalDate birthdate) {
        this.birthdate = birthdate;
    }
}
