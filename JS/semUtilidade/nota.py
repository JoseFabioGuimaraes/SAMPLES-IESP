"""
1) é uma forma de organizar e manipular dados, facilitando a modificação
2) a)
3) a)
4) A manipulação fica mais rapida, poupando memoria e tempo
5) a)
6) 

"""



nome = input("Digite o nome do aluno")
nota1 = float(input("Digite sua primeira nota: "))
nota2 = float(input("Digite sua segunda nota: "))
nota3 = float(input("Digite sua terceira nota: "))

media = (nota1+nota2+nota3)/3

if media < 6:
    print("O aluno {} foi reprovado com média {:.2f}.".format(nome,media))
elif(media >=6 and media < 7):
    print("O aluno {} está em recuperação com a média {:.2f}.".format(nome,media))
else:
    print("O aluno {} foi aprovado com média {:.2f}.".format(nome,media))
