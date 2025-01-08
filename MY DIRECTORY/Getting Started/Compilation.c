#include <stdio.h>
// phases of compilation in c
// source code (.c) -> preprocessor --> (Preprocessed file .i file) -> compiler --> (assembly code .s file)-> assembler --> (object code .o file) -> linker -> executable

// we use gcc filename.c –o filename for compiling.
// and this ./filename for execution

// four phases for a C program
// Pre-processing
// Compilation
// Assembly
// Linking

// Pre-processing :-
// Removal of Comments
// Expansion of Macros
// Expansion of the included files.
// Conditional compilation
// The preprocessed output is stored in the filename.i.

// Compiling :-
// The next step is to compile filename.i and produce an;
// intermediate compiled output file filename.s.
// This file is in assembly-level instructions.

// Assembling :-
// In this phase the filename.s is taken as input and turned into filename.o by the assembler.
// This file contains machine-level instructions.
// At this phase, only existing code is converted into machine language,
// and the function calls like printf() are not resolved.

// Linking :-
// This is the final phase in which all the linking of function calls with their definitions is done.
// Linker knows where all these functions are implemented.
// Linker does some extra work also, it adds some extra code to our program which is required when the program starts and ends.
// The final output is an executable file.

// Flags are commonly used to control or to indicate the intermediate state or outcome of particular operations.
// -E	Preprocessed file	Stops after preprocessing, outputting the preprocessed code.
// -S	Assembly file	Stops after compilation, outputting the assembly code.
// -c	Object file	Stops after assembly, generating a machine-readable object file.
// -o <filename>	Output file	Specifies the name of the output file at any stage

// we don't use exit function because
// makes debugging and maintenance challenging
// prevents proper dealing of heap memory
