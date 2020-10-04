package org.craftedsw.tripservicekata.trip;

import org.craftedsw.tripservicekata.exception.UserNotLoggedInException;
import org.craftedsw.tripservicekata.user.User;
import org.junit.Test;


public class TripServiceTest {

  @Test(expected = UserNotLoggedInException.class)
  public  void throws_an_exception_when_user_is_not_logged_in(){

    TripService service = new TestableTripService();

    service.getTripsByUser(null);
  }

  private class TestableTripService extends TripService{
    @Override
    protected User getLoggedInUser(){
      return null;
    }

  }
}
