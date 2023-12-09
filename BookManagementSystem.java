package SistemadeBiblioteca;

import java.util.ArrayList;
import java.util.Scanner;

public class BookManagementSystem {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> library = new ArrayList<>();

        int choice = 0;

        do {
            System.out.println("Biblioteca Menu:");
            System.out.println("1. Adicionar Livro");
            System.out.println("2. Remover Livro");
            System.out.println("3. Listar Livros");
            System.out.println("4. Sair");
            System.out.print("Escolha a opção: ");
            
            try {
                choice = scanner.nextInt();
                scanner.nextLine(); 
                
                switch (choice) {
                    case 1:
                        addBook(scanner, library);
                        break;
                    case 2:
                        removeBook(scanner, library);
                        break;
                    case 3:
                        listBooks(library);
                        break;
                    case 4:
                        System.out.println("Saindo do programa.");
                        break;
                    default:
                        System.out.println("Opção inválida. Tente novamente.");
                }
            } catch (Exception e) {
                System.out.println("Erro de entrada. Certifique-se de inserir um número válido.");
                scanner.nextLine();
            }

        } while (choice != 4);
        
        scanner.close();
    }

    private static void addBook(Scanner scanner, ArrayList<Book> library) {
        System.out.print("ID: ");
        int id = scanner.nextInt();
        scanner.nextLine(); 

        System.out.print("Título: ");
        String title = scanner.nextLine();

        System.out.print("Autor: ");
        String author = scanner.nextLine();

        System.out.print("Ano de Publicação: ");
        int yearPublication = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Gênero: ");
        String genre = scanner.nextLine();

        Book newBook = new Book(id, title, author, yearPublication, genre);
        library.add(newBook);
        System.out.println("Livro adicionado com sucesso!");
    }

    private static void removeBook(Scanner scanner, ArrayList<Book> library) {
        System.out.print("Digite o ID do livro a ser removido: ");
        int idToRemove = scanner.nextInt();
        scanner.nextLine(); 

        boolean removed = false;
        for (Book book : library) {
            if (book.getId() == idToRemove) {
                library.remove(book);
                removed = true;
                System.out.println("Livro removido com sucesso!");
                break;
            }
        }

        if (!removed) {
            System.out.println("Livro não encontrado com o ID especificado.");
        }
    }

    private static void listBooks(ArrayList<Book> library) {
        if (library.isEmpty()) {
            System.out.println("A biblioteca está vazia.");
        } else {
            System.out.println("Lista de Livros:");
            for (Book book : library) {
                System.out.println("ID: " + book.getId() + ", Título: " + book.getTitle() + ", Autor: " + book.getAuthor()
                        + ", Ano de Publicação: " + book.getYearPublication() + ", Gênero: " + book.getGenre());
            }
        }
    }
}