/***********************************************************************
 * Module:  Subscriber.java
 * Author:  goran
 * Purpose: Defines the Interface Subscriber
 ***********************************************************************/

package observer;

import java.util.*;

import model.ApplicationModel;

public interface Subscriber {
   /** @param applicationModel */
   void update(Subject applicationModel);

}