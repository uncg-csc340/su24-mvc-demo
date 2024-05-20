# su24-mvc-demo
## Things to note:
- `@Controller` (MVC Controller that returns a view) instead of  `@RestController`.
- Use of `@Service` class and `@Autowired`.
- Return view names.
- All views live in src/main/resources/templates.
- Static resources such as images, stylesheets, scripts, etc should be in src/main/resources/static.
- Return `"redirect:/link/to/redirect"` - if there is not necessarily a view attached to an action. e.g. going back to list after deleting one item.
- Model attribute names and objects using `model.addAttribute("studentList", service.getAllStudents());`
- View
    - `data-th-each="student : ${studentList}"` => "For each student in studentList"
   - `<p data-th-text="${student.id}"></p>` => "The text content for this this paragraph element should be whatever the student id is".
   - `<a data-th-href="@{/students/{id} (id=${student.id})}" data-th-text="${student.id}"></a>` => Make a link that includes a variable in the path. Here the variabe `id` is the student id. The text shown by the link is also the student id (otherwise it will be bank and you cannot click on anything).We are using the @ notation because we need access to the objects. Other links that do not include data from the model can be made the regular HTML way.
- On the browser: http://localhost:8080/students/all
