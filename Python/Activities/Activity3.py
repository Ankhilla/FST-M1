
usr1 = input("enter player1 name:")
usr2 = input("enter player2 name:")
usr1_anr = input(usr1 + ", what do you want to choose?: rock paper or scissors?").lower()
usr2_anr = input(usr2 + ", what do you want to choose?: rock paper or scissors?").lower()
if (usr1_anr == usr2_anr):
    print("game is tie!")
elif usr1_anr == 'rock':
    if usr2_anr == 'paper':
        print("rock wins!")
    else:
        print("scissor wins!")
elif usr1_anr == 'paper':
    if usr2_anr == 'scissor':
        print("paper wins!")
    else:
        print("rock wins!")
elif usr1_anr == 'scisoor':
    if usr2_anr == 'rock':
        print("scissor wins!")
    else:
        print("paper wins!")
else: print("invalid entry, choose any one of rock, paper, scissor, or trya again")        

  