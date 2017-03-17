#This is the sample server code that used to communicate with the android app
#that is used to control the DJI drone.
#Future work: develop a more useful package format to implement the control of the drone
#Writen by Zhitian Zhang, last modified at 3/14/2017

import socket


s = socket.socket()         # Create a socket object
host = socket.gethostname() # Get local machine name

#port number and bind it to the host
port = 5000
s.bind((host, port))

#the ip adress of the server will be printed when the script is executed.
print socket.gethostbyname(socket.gethostname())
s.listen(5)                 # Now wait for client connection.
while True:
   c, addr = s.accept()     # Establish connection with client.
   print 'The server is connected by client with', addr
   #recieve and print out the data from client
   data = c.recv(1024)
   print "Received: ", repr(data)
   #prompt user to enter command for drone
   #Available command: Take off, Auto land, Force land
   com = raw_input("Command: ")
   c.sendall(com)
   c.close()                # Close the connection

#To send another command, client need to reconnect to the server.
