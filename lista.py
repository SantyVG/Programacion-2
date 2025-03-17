

lista = list()
lista2 = []
lista1=["mango","pera"]
lista1 [0] = 'unitecnar'
lista1 [1] = "unicartagena"
print(lista1)

lista2.append("duban")
lista2.append("santiago")

lista2.insert(2,'mateo')
print(lista2)
print(len(lista2))
del(lista2[0])
print(lista2)

lista2.remove("santiago")

print(lista2)
lista2.append("ivan")
lista2.append("yola")
print(lista2)
lista.pop(0)
print(lista2)


lista3=lista2.copy()
print(lista3)

print(lista3.count("ivan"))

print(lista3.index("yola"))

lista3.append("marian")
lista3.append("nacho")
lista3.sort()
print(lista3)
