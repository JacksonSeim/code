import sys
#Board Assignments
a1=a2=a3=b1=b2=b3=c1=c2=c3="-"

scoreboardp1=0
scoreboardp2=0
gamenum=0

board=("   a     b     c\n      |     |     \n1  "+a1+"  |  "+b1+"  |  "+c1+"  \n _____|_____|_____\n      |     |     \n2  "+a2+"  |  "+b2+"  |  "+c2+"  \n _____|_____|_____\n      |     |     \n3  "+a3+"  |  "+b3+"  |  "+c3+"  \n      |     |     ")
boardStatic=("   a     b     c\n      |     |     \n1  -  |  -  |  -  \n _____|_____|_____\n      |     |     \n2  -  |  -  |  -  \n _____|_____|_____\n      |     |     \n3  -  |  -  |  -  \n      |     |     ")

print("\t    WELCOME TO TIC-TAC-TOE!")

def ChoosingXO():
    global board, p1, p2, boardStatic
    p1=input("Player 1 choose X's or O's: ")
    if(p1.upper()=="X"):
        p1="X"
        p2="O"
    elif(p1.upper()=="O"):
        p1="O"
        p2="X"
    else:
        print("Make sure it is in the correct format.")
        ChoosingXO()
    print("Player 1 you are " + p1 +"'s!")
    print("Player 2 you are " + p2 +"'s!")
    print("\n\nPlayer 1 you go First.\n\n\n\n")
    print(boardStatic)

ChoosingXO()

def Game():
    global a1, a2, a3, b1, b2, b3, c1, c2, c3
    a1=a2=a3=b1=b2=b3=c1=c2=c3="-"
    fullp1turn()
    fullp2turn()
    fullp1turn()
    fullp2turn()
    fullp1turn()
    Win_or_Not()
    fullp2turn()
    Win_or_Not()
    fullp1turn()
    Win_or_Not()
    fullp2turn()
    Win_or_Not()
    fullp1turn()
    Win_or_Not()
    tie()
    


def boardRefresh():
    global board, a1, a2, a3, b1, b2, b3, c1, c2, c3
    board=("   a     b     c\n      |     |     \n1  "+a1+"  |  "+b1+"  |  "+c1+"  \n _____|_____|_____\n      |     |     \n2  "+a2+"  |  "+b2+"  |  "+c2+"  \n _____|_____|_____\n      |     |     \n3  "+a3+"  |  "+b3+"  |  "+c3+"  \n      |     |     ")

def p1turn():
    global board, a1, a2, a3, b1, b2, b3, c1, c2, c3, p1
    print("\nPlease input places as, a1, b2, and c3.\n\n")
    turn=input("Player 1 please enter your spot: ")
    if(turn=="a1" and a1=="-"):
        a1=p1
    elif(turn=="a2" and a2=="-"):
        a2=p1
    elif(turn=="a3" and a3=="-"):
        a3=p1
    elif(turn=="b1" and b1=="-"):
        b1=p1
    elif(turn=="b2" and b2=="-"):
        b2=p1
    elif(turn=="b3" and b3=="-"):
        b3=p1
    elif(turn=="c1" and c1=="-"):
        c1=p1
    elif(turn=="c2" and c2=="-"):
        c2=p1
    elif(turn=="c3" and c3=="-"):
        c3=p1
    else:
        print("\n\nINVALID INPUT\n\nMake sure it is in the correct format. (ex. a1, b2, c3\)\n\n")
        p1turn()

def fullp1turn():
    p1turn()
    boardRefresh()
    print(board)

def p2turn():
    global board, a1, a2, a3, b1, b2, b3, c1, c2, c3, p2
    print("\nPlease input places as, a1, b2, and c3.\n\n")
    turn=input("Player 2 please enter your spot: ")
    if(turn=="a1" and a1=="-"):
        a1=p2
    elif(turn=="a2" and a2=="-"):
        a2=p2
    elif(turn=="a3" and a3=="-"):
        a3=p2
    elif(turn=="b1" and b1=="-"):
        b1=p2
    elif(turn=="b2" and b2=="-"):
        b2=p2
    elif(turn=="b3" and b3=="-"):
        b3=p2
    elif(turn=="c1" and c1=="-"):
        c1=p2
    elif(turn=="c2" and c2=="-"):
        c2=p2
    elif(turn=="c3" and c3=="-"):
        c3=p2
    else:
        print("\n\nINVALID INPUT\n\nMake sure it is in the correct format. (ex. a1, b2, c3\)\n\n")
        p2turn()

def fullp2turn():
    p2turn()
    boardRefresh()
    print(board)

def p1win():
    global a1, a2, a3, b1, b2, b3, c1, c2, c3, p1, p2, scoreboardp1, scoreboardp2
    if(a1==p1 and b1==p1 and c1==p1):
        print("GAME OVER!\n\nPLAYER 1 WINS!!")
        scoreboardp1+=1
        playagain()
    elif(a2==p1 and b2==p1 and c2==p1):
        print("GAME OVER!\n\nPLAYER 1 WINS!!")
        scoreboardp1+=1
        playagain()
    elif(a3==p1 and b3==p1 and c3==p1):
        print("GAME OVER!\n\nPLAYER 1 WINS!!")
        scoreboardp1+=1
        playagain()
    elif(a1==p1 and a2==p1 and a3==p1):
        print("GAME OVER!\n\nPLAYER 1 WINS!!")
        scoreboardp1+=1
        playagain()
    elif(b1==p1 and b2==p1 and b3==p1):
        print("GAME OVER!\n\nPLAYER 1 WINS!!")
        scoreboardp1+=1
        playagain()
    elif(c1==p1 and c2==p1 and c3==p1):
        print("GAME OVER!\n\nPLAYER 1 WINS!!")
        scoreboardp1+=1
        playagain()
    elif(a1==p1 and b2==p1 and c3==p1):
        print("GAME OVER!\n\nPLAYER 1 WINS!!")
        scoreboardp1+=1
        playagain()
    elif(c1==p1 and b2==p1 and a3==p1):
        print("GAME OVER!\n\nPLAYER 1 WINS!!")
        scoreboardp1+=1
        playagain()

def p2win():
    global a1, a2, a3, b1, b2, b3, c1, c2, c3, p1, p2, scoreboardp1, scoreboardp2
    if(a1==p2 and b1==p2 and c1==p2):
        print("GAME OVER!\n\nPLAYER 2 WINS!!")
        scoreboardp2+=1
        playagain()
    elif(a2==p2 and b2==p2 and c2==p2):
        print("GAME OVER!\n\nPLAYER 2 WINS!!")
        scoreboardp2+=1
        playagain()
    elif(a3==p2 and b3==p2 and c3==p2):
        print("GAME OVER!\n\nPLAYER 2 WINS!!")
        scoreboardp2+=1
        playagain()
    elif(a1==p2 and a2==p2 and a3==p2):
        print("GAME OVER!\n\nPLAYER 2 WINS!!")
        scoreboardp2+=1
        playagain()
    elif(b1==p2 and b2==p2 and b3==p2):
        print("GAME OVER!\n\nPLAYER 2 WINS!!")
        scoreboardp2+=1
        playagain()
    elif(c1==p2 and c2==p2 and c3==p2):
        print("GAME OVER!\n\nPLAYER 2 WINS!!")
        scoreboardp2+=1
        playagain()
    elif(a1==p2 and b2==p2 and c3==p2):
        print("GAME OVER!\n\nPLAYER 2 WINS!!")
        scoreboardp2+=1
        playagain()
    elif(c1==p2 and b2==p2 and a3==p2):
        print("GAME OVER!\n\nPLAYER 2 WINS!!")
        scoreboardp2+=1
        playagain()

def tie():
    global a1, a2, a3, b1, b2, b3, c1, c2, c3, p1, p2
    if(a1==p1 and b1==p1 and c1==p1):
        print("GAME OVER!\n\nPLAYER 1 WINS!!")
        playagain()
    elif(a2==p1 and b2==p1 and c2==p1):
        print("GAME OVER!\n\nPLAYER 1 WINS!!")
        playagain()
    elif(a3==p1 and b3==p1 and c3==p1):
        print("GAME OVER!\n\nPLAYER 1 WINS!!")
        playagain()
    elif(a1==p1 and a2==p1 and a3==p1):
        print("GAME OVER!\n\nPLAYER 1 WINS!!")
        playagain()
    elif(b1==p1 and b2==p1 and b3==p1):
        print("GAME OVER!\n\nPLAYER 1 WINS!!")
        playagain()
    elif(c1==p1 and c2==p1 and c3==p1):
        print("GAME OVER!\n\nPLAYER 1 WINS!!")
        playagain()
    elif(a1==p1 and b2==p1 and c3==p1):
        print("GAME OVER!\n\nPLAYER 1 WINS!!")
        playagain()
    elif(c1==p1 and b2==p1 and a3==p1):
        print("GAME OVER!\n\nPLAYER 1 WINS!!")
        playagain()
    elif(a1==p2 and b1==p2 and c1==p2):
        print("GAME OVER!\n\nPLAYER 2 WINS!!")
        playagain()
    elif(a2==p2 and b2==p2 and c2==p2):
        print("GAME OVER!\n\nPLAYER 2 WINS!!")
        playagain()
    elif(a3==p2 and b3==p2 and c3==p2):
        print("GAME OVER!\n\nPLAYER 2 WINS!!")
        playagain()
    elif(a1==p2 and a2==p2 and a3==p2):
        print("GAME OVER!\n\nPLAYER 2 WINS!!")
        playagain()
    elif(b1==p2 and b2==p2 and b3==p2):
        print("GAME OVER!\n\nPLAYER 2 WINS!!")
        playagain()
    elif(c1==p2 and c2==p2 and c3==p2):
        print("GAME OVER!\n\nPLAYER 2 WINS!!")
        playagain()
    elif(a1==p2 and b2==p2 and c3==p2):
        print("GAME OVER!\n\nPLAYER 2 WINS!!")
        playagain()
    elif(c1==p2 and b2==p2 and a3==p2):
        print("GAME OVER!\n\nPLAYER 2 WINS!!")
        playagain()
    else:
        print("GAME OVER!\n\nIT'S A TIE!!")
        playagain()
        
def Win_or_Not():
    p1win()
    p2win()
    
def playagain():
    global scoreboardp1, scoreboardp2
    scoreboard()
    again=input("Would you like to play agian? (y or n) ")
    if (again=="y"):
        Game()
    elif (again=="n"):
        sys.exit(0)

def scoreboard():
    global scoreboardp2, gamenum
    gamenum+=1
    print("\n\n\tSCOREBOARD")
    print("\nPlayer 1 Wins: " + str(scoreboardp1))
    print("Player 2 Wins: " + str(scoreboardp2))
    print("Game Number: " + str(gamenum) + "\n\n")
Game()

playagain()