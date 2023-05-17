class No:
    def __init__(self, dado):
        self.dado = dado
        self.esquerda = None
        self.direita = None

def imprimir_arvore(no_atual, espaco):
    if no_atual is None:
        return
    
    espaco += "   "
    
    imprimir_arvore(no_atual.direita, espaco)
    print(espaco + f"- {no_atual.dado}")
    imprimir_arvore(no_atual.esquerda, espaco)

raiz = No("Automatização de Processos em Python")

raiz.esquerda = No("Bibliotecas para automatização")
raiz.esquerda.esquerda = No("Selenium")
raiz.esquerda.direita = No("PyAutoGUI")

raiz.direita = No("Exemplos de processos automatizados")
raiz.direita.esquerda = No("Captura de informações em websites")
raiz.direita.esquerda.esquerda = No("Web Scraping com BeautifulSoup")
raiz.direita.esquerda.direita = No("Extração de informações com Selenium")
raiz.direita.direita = No("Automatização de tarefas do sistema operacional")
raiz.direita.direita.esquerda = No("Interagindo com o sistema de arquivos")
raiz.direita.direita.direita = No("Automatizando tarefas com PyAutoGUI")

imprimir_arvore(raiz, "")



'''Uma árvore binária é uma estrutura de dados onde cada nó pode ter até dois filhos,
e cada nó representa um elemento com subárvores que também são árvores binárias. 
Ela é percorrida recursivamente e pode ser utilizada em algoritmos de busca e outras áreas como processamento 
de linguagem natural e redes neurais.
'''