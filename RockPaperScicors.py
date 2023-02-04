import random
import sys

rock="rock"
paper="paper"
scissors="scissors"

rock=1
paper=2
scissors=3

tie=0
userwin=0
AIwin=0

for i in range(2):
    if (i==0):
        print("\tWelcome to Rock-Paper-Scissors\n\n")
    if (i==1):
        print("You will be playing againts a random number generator. Have fun!\n")

#print("\tWelcome to Rock-Paper-Scissors\n\nYou will be playing againts a random number generator. Have fun!\n")

def rounds():
    lmoa=int(input("\nHow many rounds do you want to go ;) - "))
    if ((lmoa%2)==0):
        print("ERROR INVAILD INPUT\nOdd numbers only\nTry again.")
        rounds()

def battle():
    global userwin, AIwin, tie, rock, paper, scissors
    gameUser=input("\n\nChoose Rock, Paper, or Scissors: ")
    gameAI=random.randint(1,3)
    if (gameUser=="rock" and gameAI==2):
        AIwin+=1
        print("\n\nLOSS\nAl choose paper.\n")
    elif(gameUser=="paper" and gameAI==3):
        AIwin+=1
        print("\n\nLOSS\nAl choose scissors.\n")
    elif(gameUser=="scissors" and gameAI==1):
        AIwin+=1
        print("\n\nLOSS\nAl choose rock.\n")
    elif(gameUser=="paper" and gameAI==1):
        userwin+=1
        print("\n\nWIN\nAl choose rock.\n")
    elif(gameUser=="scissors" and gameAI==2):
        userwin+=1
        print("\n\nWIN\nAl choose paper.\n")
    elif(gameUser=="rock" and gameAI==3):
        userwin+=1
        print("\n\nWIN\nAl choose scissors.\n")
    elif(gameUser=="rock" and gameAI==1):
        tie+=1
        print("\n\nTIE go again")
        battle()
    elif(gameUser=="paper" and gameAI==2):
        tie+=1
        print("\n\nTIE go again")
        battle()
    elif(gameUser=="scissors" and gameAI==3):
        tie+=1
        print("\n\nTIE go again")
        battle()
    else:
        print("\nERROR INVALID INPUT\nTry again")
        battle()
        

def gamescoreboard():
    global userwin, AIwin, tie, rock, paper, scissors
    print("\tSCOREBOARD")
    print("Wins: " + str(userwin))
    print("Losses: " + str(AIwin))
    print("Ties: " + str(tie))

def finalstatus():
    global tie, userwin, AIwin
    if (userwin>AIwin):
        print("\n\n\t\tYOU WIN!!!\n\n")
    elif (AIwin>userwin):
        print("\n\n\tyou lost...\n\n")
    tie=0
    userwin=0
    AIwin=0

def goagain():
    morerounds=input("\n\nDo you want to play again? ")
    if (morerounds=="yes"):
        play()
    elif (morerounds=="no"):
        print("\n\n\n\nHope you enjoyed!")
        sys.exit(0)
    else:
        print("ERROR\nPut answer in correct format.")
        goagain()
def play():
    lmoa=int(input("\nHow many rounds do you want to go ;) - "))
    if ((lmoa%2)==0):
        print("ERROR INVAILD INPUT\nOdd numbers only\nTry again.")
        rounds()
    for i in range(lmoa):
        battle()
        gamescoreboard()
    finalstatus()
    goagain()

play()