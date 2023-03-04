package Interfaces;

import Exceptions.NoDestinationException;

public interface Lead {
    void lead(Object object, String place) throws NoDestinationException;
}
