def aFunction(): String = "Criando uma function em Scala"
aFunction()
println(aFunction())

def soma(n1:Double, n2:Double) = n1 + n2
soma(5, 9)
val result = soma(5, 9)
println("Resultado da soma: " + result)

println("Outra chamada a soma: " + soma(7, 20))

def CriaNomeCompleto(nome:String, nomeDoMeio:String, sobrenome:String): String = {
  var nomecompleto = nome.concat(nomeDoMeio)
  nomecompleto = nomecompleto.concat(sobrenome)
  nomecompleto
}

var nomeCompleto = CriaNomeCompleto("Claudio ","Henrique ", "Oliveira ")
println(nomeCompleto)



def functionRecebeAny(V: Any) = println("O valor recebido foi: " + V)
functionRecebeAny("Claudio")
functionRecebeAny(6453454.5454)
functionRecebeAny(false)

val aByte: Byte = 34
functionRecebeAny(aByte)


type Texto = String
def aviso(mensagem: Texto): Texto = "Atenção: " + mensagem

println(aviso("Scala não precisa de ponto e vírgula no final da linha como SQL por exemplo!!!"))