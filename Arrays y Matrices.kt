fun main () {
    println("Exercicio 1")
    val numeros = intArrayOf(1, 2, 3, 4, 5, 6)
    var inicio = 0
    var fin = numeros.size - 1

    while (inicio < fin) {
        val temp = numeros[inicio]
        numeros[inicio] = numeros[fin]
        numeros[fin] = temp

        inicio++
        fin--
    }
    println(numeros.joinToString())

    println("Exercicio 2")
    val codigos = arrayOf("TX101", "TX102", "TX103", "TX104", "TX105")
    val buscado = "TX103"

    for (i in codigos.indices) {
        if (codigos[i] == buscado) {
            println("Código encontrado en la posición")
            break
        }
    }

    println("Exercicio 3")
    val temperaturas = doubleArrayOf(28.5, 31.0, 29.0, 33.2, 30.1, 27.8, 32.5)
    var suma = 0.0

    for (temp in temperaturas) {
        suma += temp
    }
    val promedio = suma / temperaturas.size

    for (i in temperaturas.indices) {
        if (temperaturas[i] > promedio) {
            println("El dia en el indice $i supero el promedio con ${temperaturas[i]}°")
        }
    }

    println("Exercicio 4")
    val numeros1 = IntArray(20) { it + 1 }
    var sumaPares = 0

    for (i in numeros1.indices step 2) {
        sumaPares += numeros1[i]
    }
    println("Suma de valores en índices pares: $sumaPares")

    println("Exercicio 5 ")
    val tareas = arrayOf("Hacer cafe", "Revisar correos", "Estudiar Kotlin", "Subir tarea a GitHub")

    for ((indice, tarea) in tareas.withIndex()) {
        println("${indice + 1}. $tarea")
    }

    println("Exercicio 6 ")
    val matriz = arrayOf(intArrayOf(2, 4, 6, 8), intArrayOf(1, 3, 5, 7), intArrayOf(10, 20, 30, 40))

    for (fila in matriz.indices) {
        var sumaFila = 0
        for (columna in matriz[fila].indices) {
            sumaFila += matriz[fila][columna]
        }
        println("Suma de la fila $fila: $sumaFila")
    }

    println("Exercicio 7 ")
    val original = arrayOf(intArrayOf(1, 2, 3), intArrayOf(4, 5, 6))
    val transpuesta = Array(3) { IntArray(2) }

    for (fila in original.indices) {
        for (columna in original[fila].indices) {
            transpuesta[columna][fila] = original[fila][columna]
        }
    }

    println("Matriz Original (2x3)")
    for (fila in original) {
        println(fila.joinToString())
    }

    println("Matriz Transpuesta (3x2)")
    for (fila in transpuesta) {
        println(fila.joinToString())
    }

    println("Exercicio 8")
    val matriz1 = arrayOf(intArrayOf(5, 1, 2, 3), intArrayOf(4, 5, 6, 7), intArrayOf(8, 9, 5, 1), intArrayOf(2, 3, 4, 5))
    var sumaDiagonal = 0

    println("Matriz 4x4")
    for (fila in matriz1.indices) {
        for (columna in matriz1[fila].indices) {
            print("${matriz1[fila][columna]}\t ")
            if (fila == columna) {
                sumaDiagonal += matriz1[fila][columna]
            }
        }
        println()
    }
    println("Suma de la Diagonal Principal: $sumaDiagonal")

    println("Exercicio 9")
    val matriz2 = arrayOf(intArrayOf(10, 0, 5), intArrayOf(0, 20, 0), intArrayOf(15, 0, 30))
    var sumaMayoresQueCero = 0

    for (fila in matriz2.indices) {
        for (columna in matriz2[fila].indices) {
            val valor = matriz2[fila][columna]

            if (valor == 0) {
                continue
            }

            if (valor > 0) {
                sumaMayoresQueCero += valor
            }
        }
    }
    println("Suma de los valores mayores que cero: $sumaMayoresQueCero")

    println("Exercicio 10")
    val notas = Array(3) { DoubleArray(2)}

    notas[0] = doubleArrayOf(8.5, 9.0)
    notas[1] = doubleArrayOf(5.0, 6.5)
    notas[2] = doubleArrayOf(7.0, 7.5)

    var sumaTotalGrupo = 0.0
    var totalCalificaciones = 0

    for (alumno in notas.indices)  {
        var sumaAlumno = 0.0

        for (nota in notas[alumno]) {
            sumaAlumno += nota
            sumaTotalGrupo += nota
            totalCalificaciones++
        }
        val promedioIndividual = sumaAlumno / notas[alumno].size
        val estado = if (promedioIndividual >= 7.0) "Aprobado" else "Reprobado"

        println("Alumno ${alumno + 1} -> Promedio: $promedioIndividual ($estado)")
    }

    val promedioGeneral = sumaTotalGrupo / totalCalificaciones
    println("------")
    println("Promedio general del grupo: $promedioGeneral")
}