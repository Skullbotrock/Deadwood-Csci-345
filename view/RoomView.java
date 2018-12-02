/* CSCI 345 - Object Oriented Design - Deadwood
 * Ryan Lingg and Michael Albert
 * SceneView.java
 * Created: 11/03/2018
 * Revised: 11/16/2018
 */

import java.lang.*;
import gameModel.*;

public class RoomView extends myObserver {

    //Local Variables
    Room roomRef;

    //Constructor
    RoomView(Room ref){
        this.roomRef = ref;
        this.roomRef.attach(this);
    }

    //Local SceneView Update Override
    @Override
    void update(String message){
        
        switch (message) {

            // Room Was Reset
            case (Room.RoomMessages.ResetRoom):
              System.out.printf("\n%s was reset!\n", this.roomRef.getName());
              break;

            // Scene Just Finished
            case (Room.RoomMessages.WrapScene):
              System.out.printf("\nThe scene in %s is done shooting!\n", this.roomRef.getName());
              break;
            
        }
    }

}