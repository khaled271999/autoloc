package com.example.autoloc.services;

import com.example.autoloc.entities.Reservation;

import java.util.List;

public interface IReservationService {
    Reservation ajouterReservation(Reservation reservation);
    Reservation modifierReservation(Reservation reservation);
    List<Reservation> listerReservations();
    Reservation consulterReservation(Long idReservation);
    void supprimerReservation(Long idReservation);
}
