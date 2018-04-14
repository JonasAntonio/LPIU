/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlers;

import beans.Produto;
import dao.ProdutoDao;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author jonas
 */
@WebServlet(name = "Produto", urlPatterns = {"/ServletProduto"})
public class ServletProduto extends HttpServlet {
    ProdutoDao dao = new ProdutoDao();
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    
        int opcao = Integer.parseInt(request.getParameter("opcao"));
         RequestDispatcher rd = null;
         //ProdutoDao dao = new ProdutoDao();
        
        if(opcao == 1){//cadastrar
        
            Produto prod = new Produto();

            prod.setNome(request.getParameter("nome"));
            prod.setCodigo(Integer.parseInt(request.getParameter("codigo")));
            prod.setFornecedor(request.getParameter("fornecedor"));
            prod.setTipo(request.getParameter("tipo"));
            prod.setPreco(Float.parseFloat(request.getParameter("preco")));
            prod.setDatavalidade(request.getParameter("datavalidade"));
            
            dao.adicionarProduto(prod);

            rd = request.getRequestDispatcher("ServletProduto?opcao=2");
        }
        
        if(opcao == 2){ //exibir todos
            ArrayList<Produto> lista = dao.todosProdutos();
            HttpSession session = request.getSession(true);
            session.setAttribute("produtos", lista);
            
            rd = request.getRequestDispatcher("exibirProdutos.jsp");
        }
        
        if(opcao == 3){ //remover
            int codigo = Integer.parseInt(request.getParameter("codigo"));
            Produto p = dao.consultarProduto(codigo);
            dao.removerProduto(p);
            //dao.removerProduto(dao.consultarProduto(codigo));
            rd = request.getRequestDispatcher("ServletProduto?opcao=2");
        }
        
        if(opcao == 4){//alterar
            int codigo = Integer.parseInt(request.getParameter("codigo"));
            Produto p = dao.consultarProduto(codigo);
            HttpSession session = request.getSession(true);
            session.setAttribute("prod", p);//produto para prod
            rd = request.getRequestDispatcher("formAtualizarProduto.jsp");
            
        }
        
        if(opcao == 5){
            Produto prod = new Produto();

            prod.setNome(request.getParameter("nome"));
            prod.setCodigo(Integer.parseInt(request.getParameter("codigo")));
            prod.setFornecedor(request.getParameter("fornecedor"));
            prod.setTipo(request.getParameter("tipo"));
            prod.setPreco(Float.parseFloat(request.getParameter("preco")));
            prod.setDatavalidade(request.getParameter("datavalidade"));
            
            dao.alteraProduto(prod);

            rd = request.getRequestDispatcher("ServletProduto?opcao=2");
        }
        
        rd.forward(request, response);
        
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
