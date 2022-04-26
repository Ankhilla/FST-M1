
user1 = input("enter player1 name:")
user2 = input("enter player2 name:")
while True:
    user1_anr = input(user1 + ", what do you want to choose?: rock paper or scissors?: ").lower()
    user2_anr = input(user2 + ", what do you want to choose?: rock paper or scissors?: ").lower()
    if (user1_anr == user2_anr):
        print("game is tie!")
    elif user1_anr == 'rock':
        if user2_anr == 'paper':
            print("rock wins!")
        else:
            print("scissor wins!")
    elif user1_anr == 'paper':
        if user2_anr == 'scissor':
            print("paper wins!")
        else:
            print("rock wins!")
    elif user1_anr == 'scisoor':
        if user2_anr == 'rock':
            print("scissor wins!")
        else:
            print("paper wins!")
    elif user1_anr == 'scissor':
        if user2_anr == 'paper':
            print("scissor wins!")
        else:
            print("rock wins!")        

    else: print("invalid entry, choose any one of rock, paper, scissor, or try again")        
    repeat = input("you want to play again? yes/no: ").lower()

    if repeat == "yes":
        pass
    elif repeat == "no":
        raise SystemExit
    else:
        print("print invalid option choosed exiting now.")
        raise  SystemExit 
