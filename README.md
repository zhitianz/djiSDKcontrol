# djiSDKcontrol
The structure PC -> Android -> Drone is implmented here.
This work is supported by Dr.John Licato and ACoRL Lab.
# Set up
server.py is used to set up the python server on PC.
use Android studio to open the android project files.
# Usage
Start the python server and it will provide you the IP address for the host. Default port number is 5000.
Install the app to the phone, connect the phone to the DJI remote controller. Make sure the drone is powered up too.
Enter the IP address and port number in the App. And press connect button to connect to the python server.
Python server will then prompt user to enter command for drone. 
Current available commands are: ‘Take off’, ‘Force land’, ‘Auto land’.
# Issue
One issue is that if there is a DJI error, the App will shut down. This is a pure android app issue involved with system dialog and context.
# Future work
To be continue.
# Reference
https://developer.dji.com/mobile-sdk/documentation/application-development-workflow/workflow-integrate.html
http://androidsrc.net/android-client-server-using-sockets-client-implementation/
